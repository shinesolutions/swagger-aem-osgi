function New-ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${schedulerPeriodperiod},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${schedulerPeriodconcurrent},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${servicePeriodbadUnderscorelinkUnderscoretoleranceUnderscoreinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${servicePeriodcheckUnderscoreoverrideUnderscorepatterns},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${servicePeriodcacheUnderscorebrokenUnderscoreinternalUnderscorelinks},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${servicePeriodspecialUnderscorelinkUnderscoreprefix},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${servicePeriodspecialUnderscorelinkUnderscorepatterns}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties -ArgumentList @(
            ${schedulerPeriodperiod},
            ${schedulerPeriodconcurrent},
            ${servicePeriodbadUnderscorelinkUnderscoretoleranceUnderscoreinterval},
            ${servicePeriodcheckUnderscoreoverrideUnderscorepatterns},
            ${servicePeriodcacheUnderscorebrokenUnderscoreinternalUnderscorelinks},
            ${servicePeriodspecialUnderscorelinkUnderscoreprefix},
            ${servicePeriodspecialUnderscorelinkUnderscorepatterns}
        )
    }
}
