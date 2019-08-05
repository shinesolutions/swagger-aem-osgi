function New-ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${fromPeriodaddress},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${senderPeriodhost},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${maxPeriodbouncePeriodcount}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties -ArgumentList @(
            ${fromPeriodaddress},
            ${senderPeriodhost},
            ${maxPeriodbouncePeriodcount}
        )
    }
}
