function New-ComDayCqDamHandlerStandardPsdPsdHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${largeUnderscorefileUnderscorethreshold}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamHandlerStandardPsdPsdHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamHandlerStandardPsdPsdHandlerProperties -ArgumentList @(
            ${largeUnderscorefileUnderscorethreshold}
        )
    }
}
