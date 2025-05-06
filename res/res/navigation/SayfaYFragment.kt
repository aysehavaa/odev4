class SayfaYFragment : Fragment(R.layout.fragment_sayfa_y) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Geri tuşu ile anasayfaya dönmek için:
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().popBackStack(R.id.anasayfaFragment, false)
        }
    }
}
