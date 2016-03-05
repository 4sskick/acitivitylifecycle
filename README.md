#activitylifecycle
This is sample application explaining about activity life cycle in detail state

#first time launched
onCreate->onStart->onPostCreate->onResume->onPostResume

#backpressed
onBackPressed->onPause->onStop->onDestroy

#home button pressed
onPause->onRestoreInstanceState->onStop

#re-calling application button
onRestart->onStart->onResume->onPostResume
