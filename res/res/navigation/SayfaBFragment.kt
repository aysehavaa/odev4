class SayfaBFragment : Fragment(R.layout.fragment_sayfa_b) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnGitY).setOnClickListener {
            findNavController().navigate(R.id.action_b_to_y)
        }
    }
}
