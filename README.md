This repository is no longer in use. Questy's new home is at https://github.com/DziNeIT/Questy




Questy
======

A straightforward questing system, with scripting support, written in Java. Questy is licensed under the Mozilla Public License, version 2.0. See the LICENSE file for more details.

##The Team:
<table>
	<tr>
		<th><img src="https://en.gravatar.com/userimage/33964137/1a88e05eaeb009a4323e3076b309313c.png?size=55" alt="DziNeIT" title="DziNeIT"/><br/>DziNeIT</th>
	</tr>
</table>

##Using Questy
Questy is pretty simple to use in an application. You'll need to start by picking a `ProgressStore` implementation for storing progress into quests. Implementations of `ProgressStore` can be found [here](https://github.com/VolumetricPixels/Questy/tree/master/src/main/java/com/volumetricpixels/questy/storage/store). The implementation very much depends on your needs. You may also write your own implementation by implementing the `ProgressStore` interface. Once you've got a `ProgressStore` sorted, you'll want to instantiate a `QuestManager` object. `new SimpleQuestManager(ProgressStore)` is how you'll likely achieve this. Note that `SimpleProgressStore` is not thread-safe. You may again also write your own `QuestManager` by implementing the `QuestManager` interface. If you wish to write an implementation of either `ProgressStore` or `QuestManager`, see 'Writing your own implementations'.

From here, you can load any progression that has been saved in the past (`questManager.loadProgression()`). You'll want to remember to save it at the end of your application too (`questManager.saveProgression()`).

Once you have the basics started, you can start with the actual quests. `Quest`s are loaded with `QuestLoader`s. Questy has implementations of `QuestLoader` to load `Quest`s written in JavaScript and YAML, at time of writing. You can use these, and you can also write your own `QuestLoader` (notice a theme here? Questy is abstracted enough that most things can be changed if you wish). However, `Quest`s can also be loaded in Java, using the `QuestBuilder`, specifically `QuestBuilder.begin(questManager, name)`.

When all the `Quest`s are loaded, you can do things with them. If you're adding quests to your zombie game, for example, you'll want to update the progress of peoples' zombie killing objective when they kill a zombie. When progress is updated, a `ProgressUpdateEvent` is called. This allows you to track it all in one place instead of duplicating code whenever you update progress.

###Writing your own implementations
Questy allows the user to write and use their own implementations of `QuestManager`, `ProgressStore` and `QuestLoader`. If you wish to, we would love it if you sent us a pull request containing your version. It never hurts to have more options.

To understand more about writing implementations of these interfaces, it is probably a good idea to read the JavaDocs, as they document what methods in each interface should do.
