function New-ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {
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
        ${goodUnderscorelinkUnderscoretestUnderscoreinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${badUnderscorelinkUnderscoretestUnderscoreinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${linkUnderscoreunusedUnderscoreinterval},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${connectionPeriodtimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties -ArgumentList @(
            ${schedulerPeriodperiod},
            ${schedulerPeriodconcurrent},
            ${goodUnderscorelinkUnderscoretestUnderscoreinterval},
            ${badUnderscorelinkUnderscoretestUnderscoreinterval},
            ${linkUnderscoreunusedUnderscoreinterval},
            ${connectionPeriodtimeout}
        )
    }
}
