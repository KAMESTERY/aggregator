;; https://projectile.readthedocs.io/en/latest/configuration/
;; Projectile Configuration
((nil . ((eval . (setq projectile-project-root
                       (locate-dominating-file buffer-file-name
                                               ".dir-locals.el")))
         (eval . (setq compile-command
                       `(format "cd %s && make"
                                (locate-dominating-file buffer-file-name
                                                        ".dir-locals.el"))))
         ;; (eval . (setq inf-clojure-program "lumo"))
         ;; ;; inf-clojure-boot-cmd if you are using Boot
         ;; (eval . (setq inf-clojure-lein-cmd (concat "lumo -d -c "
         ;;                                            (f-read (concat (inf-clojure-project-root) "cp")))
         ;;               ))
         )))

