function New-ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${formsManagerConfigPeriodincludeOOTBTemplates},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${formsManagerConfigPeriodincludeDeprecatedTemplates}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties -ArgumentList @(
            ${formsManagerConfigPeriodincludeOOTBTemplates},
            ${formsManagerConfigPeriodincludeDeprecatedTemplates}
        )
    }
}
