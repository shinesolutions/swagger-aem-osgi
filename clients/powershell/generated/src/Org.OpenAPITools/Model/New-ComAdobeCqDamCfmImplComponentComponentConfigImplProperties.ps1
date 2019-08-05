function New-ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${damPeriodcfmPeriodcomponentPeriodresourceType},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${damPeriodcfmPeriodcomponentPeriodfileReferenceProp},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${damPeriodcfmPeriodcomponentPeriodelementsProp},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${damPeriodcfmPeriodcomponentPeriodvariationProp}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamCfmImplComponentComponentConfigImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamCfmImplComponentComponentConfigImplProperties -ArgumentList @(
            ${damPeriodcfmPeriodcomponentPeriodresourceType},
            ${damPeriodcfmPeriodcomponentPeriodfileReferenceProp},
            ${damPeriodcfmPeriodcomponentPeriodelementsProp},
            ${damPeriodcfmPeriodcomponentPeriodvariationProp}
        )
    }
}
