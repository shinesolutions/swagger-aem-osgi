function New-ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${linkcheckertransformerPerioddisableRewriting},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${linkcheckertransformerPerioddisableChecking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${linkcheckertransformerPeriodmapCacheSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${linkcheckertransformerPeriodstrictExtensionCheck},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${linkcheckertransformerPeriodstripHtmltExtension},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${linkcheckertransformerPeriodrewriteElements},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${linkcheckertransformerPeriodstripExtensionPathBlacklist}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties -ArgumentList @(
            ${linkcheckertransformerPerioddisableRewriting},
            ${linkcheckertransformerPerioddisableChecking},
            ${linkcheckertransformerPeriodmapCacheSize},
            ${linkcheckertransformerPeriodstrictExtensionCheck},
            ${linkcheckertransformerPeriodstripHtmltExtension},
            ${linkcheckertransformerPeriodrewriteElements},
            ${linkcheckertransformerPeriodstripExtensionPathBlacklist}
        )
    }
}
