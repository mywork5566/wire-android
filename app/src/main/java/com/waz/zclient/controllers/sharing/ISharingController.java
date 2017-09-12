/**
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.controllers.sharing;

import android.app.Activity;
import com.waz.api.IConversation;
import com.waz.utils.wrappers.URI;

import java.util.List;

public interface ISharingController {

    void tearDown();

    void setSharedContentType(SharedContentType type);

    void setSharedText(String text);

    String getSharedText();

    void setSharedUris(List<URI> imageUris);

    List<URI> getSharedFileUris();

    void setSharingConversationId(String conversationId);

    void maybeResetSharedText(IConversation currentConversation);

    void maybeResetSharedUris(IConversation currentConversation);

    boolean isSharedConversation(IConversation conversation);
}
