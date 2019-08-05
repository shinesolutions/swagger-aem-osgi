function New-ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodsearchpromotePeriodconfighandlerPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties -ArgumentList @(
            ${cqPeriodsearchpromotePeriodconfighandlerPeriodenabled}
        )
    }
}
