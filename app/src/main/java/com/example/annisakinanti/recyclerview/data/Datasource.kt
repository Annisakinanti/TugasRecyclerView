package com.example.annisakinanti.recyclerview.data

import com.example.annisakinanti.recyclerview.R
import com.example.annisakinanti.recyclerview.model.Affirmation

// TODO 3: Kelas untuk menyiapkan sumber data string afirmasi
class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        // Proses mengambil data dari string.xml
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}