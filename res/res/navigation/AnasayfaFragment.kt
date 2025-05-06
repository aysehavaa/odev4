class AnasayfaFragment : Fragment(R.layout.fragment_anasayfa) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnGitA).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfa_to_a)
        }
        view.findViewById<Button>(R.id.btnGitX).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfa_to_x)
        }
    }
}
