class SayfaAFragment : Fragment(R.layout.fragment_sayfa_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnGitB).setOnClickListener {
            findNavController().navigate(R.id.action_a_to_b)
        }
    }
}
