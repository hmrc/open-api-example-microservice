/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.openapiexamplemicroservice.controllers

import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController
import play.api.mvc.ControllerComponents
import javax.inject.{Inject, Singleton}
import scala.concurrent.Future

@Singleton()
class HelloController @Inject() (cc: ControllerComponents)
    extends BackendController(cc) {

  def world = Action.async {
    Future.successful(Ok("Hello World"))
  }

  def application = Action.async {
    Future.successful(Ok("Hello Application"))
  }

  def user = Action.async {
    Future.successful(Ok("Hello User"))
  }
}
