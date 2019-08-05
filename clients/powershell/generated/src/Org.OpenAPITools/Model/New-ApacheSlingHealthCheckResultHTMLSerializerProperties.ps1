function New-ApacheSlingHealthCheckResultHTMLSerializerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${styleString}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ApacheSlingHealthCheckResultHTMLSerializerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ApacheSlingHealthCheckResultHTMLSerializerProperties -ArgumentList @(
            ${styleString}
        )
    }
}
