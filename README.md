# Simple Music Player App in Android (Kotlin)

## Introduction
Use the iTunes affiliate API to develop a simple music player app that lets you search by artist  and displays the search results on the screen. When a song is selected from the list, the song  should start to play. 
 
The app needs to work on an Android simulator. Shown below is how the music player should look on a mobile screen.

Use this [iTunes API](https://developer.apple.com/library/archive/documentation/AudioVideo/Conceptual/iTuneSearchAPI/Searching.html)

## Requirements
- Each song’s title, artist, album and album art should be displayed
- When we tap a song, a media player should show up at the bottom of the screen and start to play the preview for that song. The media player may be something as simple as a toggling play or pause button, however, it should pop-up at the bottom of the screen and on top of the list as shown. All the other controls shown are optional.
- The media player should only show once a song is clicked and should stay on the screen from that point onwards and should be reused for any subsequent song played. 
- When a song is being played, you must provide some indicator in the list item that the song is being played. 
- You can stop playback if a new search is performed, however the preference is for the song to keep playing. 
- If you stop playback when a new search is performed, you must hide the media player till a song is selected. 
- Implement a proper design pattern is a big plus.
- Implement at least one of the [state management](https://docs.flutter.dev/development/data-and-backend/state-mgmt/options) is a big plus.
- You should write the necessary unit test to cover the logic

## Notes
- Your app only needs to support one Android mobile device. Please mention what devices your app supports clearly in your documentation. 
- You must use Flutter to implement the music player. 
- You are free to design your UI as you please, however the major elements as shown in  the screens above or mentioned above should still be present. 
- You will be judged on code quality, quality of design implementation, project  structure, readability, and documentation. 
- Try to squeeze in as many of the features mentioned above as possible. You’re not going to be judged on “completeness” but rather on the quality of code and work. 
- You are free to use any libraries you wish. We are however looking to judge what you  can do, so try to avoid third-party libraries where possible. 
- Make your submission in form of a link to Gitlab, GitHub, Bitbucket or the like. Git bundle is accepted. 
- Please add a README with at least the following details: Supported devices, Supported features, List of libraries/dependencies and its functionalities, Instructions to build and deploy the app
