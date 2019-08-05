function New-ComDayCqDamCoreImplServletCompanionServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${More Info},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${SlashmntSlashoverlaySlashdamSlashguiSlashcontentSlashassetsSlashmoreinfoPeriodhtmlSlashDollarLeft_Curly_BracketpathRight_Curly_Bracket}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletCompanionServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletCompanionServletProperties -ArgumentList @(
            ${More Info},
            ${SlashmntSlashoverlaySlashdamSlashguiSlashcontentSlashassetsSlashmoreinfoPeriodhtmlSlashDollarLeft_Curly_BracketpathRight_Curly_Bracket}
        )
    }
}
