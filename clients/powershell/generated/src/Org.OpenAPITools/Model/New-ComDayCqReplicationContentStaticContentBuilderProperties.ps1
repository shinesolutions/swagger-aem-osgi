function New-ComDayCqReplicationContentStaticContentBuilderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${host},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${port}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationContentStaticContentBuilderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationContentStaticContentBuilderProperties -ArgumentList @(
            ${host},
            ${port}
        )
    }
}
