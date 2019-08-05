function New-ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${translatePeriodlanguage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${translatePerioddisplay},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${translatePeriodattribution},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${translatePeriodcaching},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${translatePeriodsmartPeriodrendering},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${translatePeriodcachingPeriodduration},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${translatePeriodsessionPeriodsavePeriodinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${translatePeriodsessionPeriodsavePeriodbatchLimit}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties -ArgumentList @(
            ${translatePeriodlanguage},
            ${translatePerioddisplay},
            ${translatePeriodattribution},
            ${translatePeriodcaching},
            ${translatePeriodsmartPeriodrendering},
            ${translatePeriodcachingPeriodduration},
            ${translatePeriodsessionPeriodsavePeriodinterval},
            ${translatePeriodsessionPeriodsavePeriodbatchLimit}
        )
    }
}
