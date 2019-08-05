function New-ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodmaxUnderscorelinksUnderscoreperUnderscorehost},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${servicePeriodsaveUnderscoreexternalUnderscorelinkUnderscorereferences}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties -ArgumentList @(
            ${servicePeriodmaxUnderscorelinksUnderscoreperUnderscorehost},
            ${servicePeriodsaveUnderscoreexternalUnderscorelinkUnderscorereferences}
        )
    }
}
