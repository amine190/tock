/*
 * Copyright (C) 2017/2021 e-voyageurs technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.tock.bot.engine.metadata

import ai.tock.bot.definition.Intent
import ai.tock.bot.engine.event.Event

class MetadataEvent(val type: MetadataEventType, val value: String, applicationId: String) : Event(applicationId){
    companion object {
        fun intent(intent: Intent, applicationId: String)  = MetadataEvent(MetadataEventType.Intent, intent.name, applicationId)
    }
}

enum class MetadataEventType {
    Intent
}
