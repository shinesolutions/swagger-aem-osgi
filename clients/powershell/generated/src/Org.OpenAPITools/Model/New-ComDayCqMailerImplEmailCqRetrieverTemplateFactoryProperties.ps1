function New-ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${mailerPeriodemailPeriodembed},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${mailerPeriodemailPeriodcharset},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${mailerPeriodemailPeriodretrieverUserID},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${mailerPeriodemailPeriodretrieverUserPWD}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties -ArgumentList @(
            ${mailerPeriodemailPeriodembed},
            ${mailerPeriodemailPeriodcharset},
            ${mailerPeriodemailPeriodretrieverUserID},
            ${mailerPeriodemailPeriodretrieverUserPWD}
        )
    }
}
