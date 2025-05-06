class SayfaXFragment : Fragment(R.layout.fragment_sayfa_x) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnGitY).setOnClickListener {
            findNavController().navigate(R.id.action_x_to_y)
        }
    }
}
