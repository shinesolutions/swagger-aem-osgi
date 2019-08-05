function New-ComDayCqMailerImplCqMailingServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${maxPeriodrecipientPeriodcount}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqMailerImplCqMailingServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqMailerImplCqMailingServiceProperties -ArgumentList @(
            ${maxPeriodrecipientPeriodcount}
        )
    }
}
