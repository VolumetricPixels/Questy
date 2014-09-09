/*
 * This file is part of Questy, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2014 VolumetricPixels <http://volumetricpixels.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.volumetricpixels.questy.event.listener;

import com.volumetricpixels.questy.event.quest.QuestAbandonEvent;
import com.volumetricpixels.questy.event.quest.QuestCompleteEvent;
import com.volumetricpixels.questy.event.quest.QuestStartEvent;
import com.volumetricpixels.questy.event.quest.objective.ObjectiveCompleteEvent;
import com.volumetricpixels.questy.event.quest.objective.ObjectiveFailEvent;
import com.volumetricpixels.questy.event.quest.objective.ObjectiveStartEvent;

/**
 * Used for listening to {@link com.volumetricpixels.questy.event.quest.QuestEvent}s. Note that implementation of this
 * interface requires a method for each and every {@link com.volumetricpixels.questy.event.quest.QuestEvent} - if you
 * only want one or to you should instead use {@link BaseQuestListener}, or
 * {@link GenericQuestListener} if you want to listen for every type of {@link
 * com.volumetricpixels.questy.event.quest.QuestEvent} from one method.
 */
public interface QuestListener {
    // TODO: JavaDoc
    void questStarted(QuestStartEvent event);

    void questAbandoned(QuestAbandonEvent event);

    void questCompleted(QuestCompleteEvent event);

    void objectiveCompleted(ObjectiveCompleteEvent event);

    void objectiveFailed(ObjectiveFailEvent event);

    void objectiveStarted(ObjectiveStartEvent event);
}
