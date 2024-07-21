package com.example.exercisemodule10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exercisemodule10.databinding.ContactListBinding
import com.google.android.material.snackbar.Snackbar

class ContactActivity : AppCompatActivity(), ContactListAdapter.ContactListAdapterListener {
    private lateinit var binding: ContactListBinding
    private val itemList: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ContactListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactListView = binding.contactList

        createMockDataWithNamesAndPhones()

        contactListView.layoutManager = LinearLayoutManager(this)
        contactListView.adapter = ContactListAdapter(itemList, this)

    }

    private fun createMockDataWithNamesAndPhones() {
        itemList.add(ContactInfo("João Silva", "(11)91234-5678"))
        itemList.add(ContactInfo("Maria Oliveira", "(21)99876-5432"))
        itemList.add(ContactInfo("Pedro Souza", "(31)98765-4321"))
        itemList.add(ContactInfo("Ana Costa", "(41)97654-3210"))
        itemList.add(ContactInfo("Carlos Pereira", "(51)96543-2109"))
        itemList.add(ContactInfo("Paula Santos", "(61)95432-1098"))
        itemList.add(ContactInfo("Fernanda Lima", "(71)94321-0987"))
        itemList.add(ContactInfo("Marcos Fernandes", "(81)93210-9876"))
        itemList.add(ContactInfo("Julia Alves", "(91)92109-8765"))
        itemList.add(ContactInfo("Lucas Rodrigues", "(11)91234-5678"))
        itemList.add(ContactInfo("Carla Souza", "(21)99876-5432"))
        itemList.add(ContactInfo("Bruno Ferreira", "(31)98765-4321"))
        itemList.add(ContactInfo("Juliana Mendes", "(41)97654-3210"))
        itemList.add(ContactInfo("Gustavo Almeida", "(51)96543-2109"))
        itemList.add(ContactInfo("Larissa Barbosa", "(61)95432-1098"))
        itemList.add(ContactInfo("Rafael Silva", "(71)94321-0987"))
        itemList.add(ContactInfo("Beatriz Lima", "(81)93210-9876"))
        itemList.add(ContactInfo("Renato Carvalho", "(91)92109-8765"))
        itemList.add(ContactInfo("Patrícia Azevedo", "(11)91234-5678"))
        itemList.add(ContactInfo("Vinícius Martins", "(21)99876-5432"))
        itemList.add(ContactInfo("Vanessa Borges", "(31)98765-4321"))
        itemList.add(ContactInfo("Fábio Correia", "(41)97654-3210"))
        itemList.add(ContactInfo("Priscila Ribeiro", "(51)96543-2109"))
        itemList.add(ContactInfo("Thiago Duarte", "(61)95432-1098"))
        itemList.add(ContactInfo("Camila Gomes", "(71)94321-0987"))
        itemList.add(ContactInfo("Leonardo Nunes", "(81)93210-9876"))
        itemList.add(ContactInfo("Bianca Teixeira", "(91)92109-8765"))
        itemList.add(ContactInfo("Felipe Araújo", "(11)91234-5678"))
        itemList.add(ContactInfo("Sabrina Melo", "(21)99876-5432"))
        itemList.add(ContactInfo("Eduardo Dias", "(31)98765-4321"))
        itemList.add(ContactInfo("Alessandra Monteiro", "(41)97654-3210"))
    }

    override fun onItemClicked(content: String) {
        Snackbar.make(
            binding.root, content,
            Snackbar.LENGTH_SHORT
        ).show()
    }

}