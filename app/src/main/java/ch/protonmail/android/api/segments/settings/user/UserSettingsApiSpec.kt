/*
 * Copyright (c) 2020 Proton Technologies AG
 * 
 * This file is part of ProtonMail.
 * 
 * ProtonMail is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ProtonMail is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ProtonMail. If not, see https://www.gnu.org/licenses/.
 */
package ch.protonmail.android.api.segments.settings.mail

import ch.protonmail.android.api.models.ResponseBody
import ch.protonmail.android.api.models.SrpResponseBody
import ch.protonmail.android.api.models.UserSettingsResponse
import ch.protonmail.android.api.models.requests.PasswordChange
import ch.protonmail.android.api.models.requests.UpgradePasswordBody
import java.io.IOException

interface UserSettingsApiSpec {

    @Throws(IOException::class)
    fun fetchUserSettings(): UserSettingsResponse

    @Throws(IOException::class)
    fun fetchUserSettings(username : String): UserSettingsResponse

    @Throws(IOException::class)
    fun updateNotify(updateNotify: Boolean): ResponseBody?

    @Throws(IOException::class)
    fun updateNotificationEmail(srpSession: String, clientEpheremal: String, clientProof: String, twoFactorCode: String?, email: String): SrpResponseBody?

    @Throws(IOException::class)
    fun updateLoginPassword(passwordChangeBody: PasswordChange): SrpResponseBody?

    @Throws(IOException::class)
    fun upgradeLoginPassword(upgradePasswordBody: UpgradePasswordBody): ResponseBody?

}