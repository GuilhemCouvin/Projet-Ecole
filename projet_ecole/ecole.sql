-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 09, 2019 at 05:18 PM
-- Server version: 5.7.23
-- PHP Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `ecole`
--

-- --------------------------------------------------------

--
-- Table structure for table `annee_scolaire`
--

CREATE TABLE `annee_scolaire` (
  `id` int(11) NOT NULL,
  `annee` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `annee_scolaire`
--

INSERT INTO `annee_scolaire` (`id`, `annee`) VALUES
(1, '2018-2019'),
(2, '2019-2020');

-- --------------------------------------------------------

--
-- Table structure for table `bulletin`
--

CREATE TABLE `bulletin` (
  `id` int(11) NOT NULL,
  `trimestre_id` int(11) NOT NULL,
  `inscription_id` int(11) NOT NULL,
  `appreciation` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bulletin`
--

INSERT INTO `bulletin` (`id`, `trimestre_id`, `inscription_id`, `appreciation`) VALUES
(1, 3, 1, 'Bon travail dans l\'ensemble, continuez comme ça.'),
(2, 3, 2, 'Plus d\'efforts à fournir !'),
(3, 3, 3, 'Manque d\'implication.');

-- --------------------------------------------------------

--
-- Table structure for table `classe`
--

CREATE TABLE `classe` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `annee_scolaire_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `classe`
--

INSERT INTO `classe` (`id`, `nom`, `annee_scolaire_id`) VALUES
(1, 'TD01', 1),
(2, 'TD02', 1),
(3, 'TD01', 2);

-- --------------------------------------------------------

--
-- Table structure for table `detail_bulletin`
--

CREATE TABLE `detail_bulletin` (
  `id` int(11) NOT NULL,
  `bulletin_id` int(11) NOT NULL,
  `enseignement_id` int(11) NOT NULL,
  `appreciation` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `detail_bulletin`
--

INSERT INTO `detail_bulletin` (`id`, `bulletin_id`, `enseignement_id`, `appreciation`) VALUES
(1, 1, 2, 'Soyez plus rigoureux dans vos calculs!'),
(2, 2, 1, 'Revoir les équations de Maxwell !'),
(3, 3, 3, 'Très bon travail !');

-- --------------------------------------------------------

--
-- Table structure for table `discipline`
--

CREATE TABLE `discipline` (
  `id` int(11) NOT NULL,
  `nom` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `discipline`
--

INSERT INTO `discipline` (`id`, `nom`) VALUES
(1, 'Mathématiques'),
(2, 'Physique');

-- --------------------------------------------------------

--
-- Table structure for table `enseignement`
--

CREATE TABLE `enseignement` (
  `id` int(11) NOT NULL,
  `classe_id` int(11) NOT NULL,
  `discipline_id` int(11) NOT NULL,
  `personne_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `enseignement`
--

INSERT INTO `enseignement` (`id`, `classe_id`, `discipline_id`, `personne_id`) VALUES
(1, 2, 1, 2),
(2, 1, 2, 4),
(3, 3, 2, 4);

-- --------------------------------------------------------

--
-- Table structure for table `evaluation`
--

CREATE TABLE `evaluation` (
  `id` int(11) NOT NULL,
  `detail_bulletin_id` int(11) NOT NULL,
  `note` int(11) NOT NULL,
  `appreciation` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `evaluation`
--

INSERT INTO `evaluation` (`id`, `detail_bulletin_id`, `note`, `appreciation`) VALUES
(1, 1, 10, 'Pas assez travaillé, peut faire beaucoup mieux.'),
(2, 2, 14, 'Bon travail, toujours quelques lacunes sur les equations de Maxwell. '),
(3, 3, 4, 'Sans commentaire.');

-- --------------------------------------------------------

--
-- Table structure for table `inscription`
--

CREATE TABLE `inscription` (
  `id` int(11) NOT NULL,
  `classe_id` int(11) NOT NULL,
  `ecole_id` int(11) NOT NULL,
  `personne_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `inscription`
--

INSERT INTO `inscription` (`id`, `classe_id`, `ecole_id`, `personne_id`) VALUES
(1, 1, 1, 1),
(2, 2, 1, 3),
(3, 3, 1, 5);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'ECE', '1234'),
(2, 'Avak', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `niveau`
--

CREATE TABLE `niveau` (
  `id` int(11) NOT NULL,
  `nom` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `niveau`
--

INSERT INTO `niveau` (`id`, `nom`) VALUES
(1, 'ING1'),
(2, 'ING2'),
(3, 'ING3'),
(4, 'ING4'),
(5, 'ING5');

-- --------------------------------------------------------

--
-- Table structure for table `personne`
--

CREATE TABLE `personne` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `personne`
--

INSERT INTO `personne` (`id`, `nom`, `prenom`, `type`) VALUES
(1, 'Avakian', 'Alexandre', 'eleve'),
(2, 'Dupont', 'Jean', 'prof'),
(3, 'Couvin', 'Guilhem', 'eleve'),
(4, 'Segado', 'JP', 'prof'),
(5, 'Valjean', 'Jean', 'eleve');

-- --------------------------------------------------------

--
-- Table structure for table `Trimestre`
--

CREATE TABLE `Trimestre` (
  `id` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `debut` varchar(255) NOT NULL,
  `fin` varchar(255) NOT NULL,
  `annee` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Trimestre`
--

INSERT INTO `Trimestre` (`id`, `numero`, `debut`, `fin`, `annee`) VALUES
(1, 1, 'Septembre', 'Novembre', 1),
(2, 2, 'Decembre', 'Fevrier', 1),
(3, 3, 'Mars', 'Mai', 1),
(4, 1, 'Septembre', 'Novembre', 2),
(5, 2, 'Decembre', 'Fevrier', 2),
(6, 3, 'Mars', 'Mai', 2);

-- --------------------------------------------------------

--
-- Table structure for table `trismestre`
--

CREATE TABLE `trismestre` (
  `id` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `debut` date NOT NULL,
  `fin` date NOT NULL,
  `annee_scolaire_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `annee_scolaire`
--
ALTER TABLE `annee_scolaire`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bulletin`
--
ALTER TABLE `bulletin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `detail_bulletin`
--
ALTER TABLE `detail_bulletin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `discipline`
--
ALTER TABLE `discipline`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `enseignement`
--
ALTER TABLE `enseignement`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `evaluation`
--
ALTER TABLE `evaluation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `niveau`
--
ALTER TABLE `niveau`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Trimestre`
--
ALTER TABLE `Trimestre`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `trismestre`
--
ALTER TABLE `trismestre`
  ADD PRIMARY KEY (`id`);
