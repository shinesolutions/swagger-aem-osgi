function New-ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodaemPeriodscreensPeriodimplPeriodremotePeriodrequestUnderscoretimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties -ArgumentList @(
            ${comPeriodadobePeriodaemPeriodscreensPeriodimplPeriodremotePeriodrequestUnderscoretimeout}
        )
    }
}
