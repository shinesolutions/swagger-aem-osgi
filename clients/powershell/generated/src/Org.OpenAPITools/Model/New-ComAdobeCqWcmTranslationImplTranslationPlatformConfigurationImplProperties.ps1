function New-ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${syncTranslationStatePeriodschedulingFormat},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulingRepeatTranslationPeriodschedulingFormat},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${syncTranslationStatePeriodlockTimeoutInMinutes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${exportPeriodformat}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties -ArgumentList @(
            ${syncTranslationStatePeriodschedulingFormat},
            ${schedulingRepeatTranslationPeriodschedulingFormat},
            ${syncTranslationStatePeriodlockTimeoutInMinutes},
            ${exportPeriodformat}
        )
    }
}
