function New-ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${damPeriodcfmPeriodresourceTypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${damPeriodcfmPeriodreferenceProperties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamCfmImplConfFeatureConfigImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamCfmImplConfFeatureConfigImplProperties -ArgumentList @(
            ${damPeriodcfmPeriodresourceTypes},
            ${damPeriodcfmPeriodreferenceProperties}
        )
    }
}
