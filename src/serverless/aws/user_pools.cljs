(ns serverless.aws.user-pools
  (:require [goog.object :as gobj]
            [serverless.aws.sdk :refer [AWS js-call]]))

(defonce ^:private CognitoIdentityServiceProvider
  (gobj/get AWS "CognitoIdentityServiceProvider"))

(defonce ^:private service-provider ^:private
  (CognitoIdentityServiceProvider.))

(defonce admin-create-user
  (partial js-call service-provider "adminCreateUser"))

(defonce admin-get-user
  (partial js-call service-provider "adminGetUser"))

(defonce confirm-sign-up
  (partial js-call service-provider "confirmSignUp"))

(defonce list-users
  (partial js-call service-provider "listUsers"))
