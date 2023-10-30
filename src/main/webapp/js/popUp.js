
    const reservationModal = document.getElementById('reservation-modal');
    const openReservationModalButton = document.getElementById('open-reservation-modal');
    const closeReservationModalButton = document.getElementById('close-reservation-modal');

    openReservationModalButton.addEventListener('click', () => {
    reservationModal.classList.remove('hidden');
});

    closeReservationModalButton.addEventListener('click', () => {
    reservationModal.classList.add('hidden');
});

