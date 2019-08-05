function New-ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${mailerPeriodemailPeriodcharset}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties -ArgumentList @(
            ${mailerPeriodemailPeriodcharset}
        )
    }
}
