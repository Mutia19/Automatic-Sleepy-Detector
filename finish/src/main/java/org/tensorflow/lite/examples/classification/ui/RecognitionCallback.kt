package org.tensorflow.lite.examples.classification.ui

import org.tensorflow.lite.examples.classification.viewmodel.Recognition

interface RecognitionCallback {
    fun onRecognitionThreshold(recognition: Recognition)
}