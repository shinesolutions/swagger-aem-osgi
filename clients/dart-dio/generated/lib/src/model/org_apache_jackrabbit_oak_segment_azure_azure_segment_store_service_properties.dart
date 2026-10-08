//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties.g.dart';

/// OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
///
/// Properties:
/// * [accountName] 
/// * [containerName] 
/// * [accessKey] 
/// * [rootPath] 
/// * [connectionURL] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties implements Built<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties, OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'accountName')
  ConfigNodePropertyString? get accountName;

  @BuiltValueField(wireName: r'containerName')
  ConfigNodePropertyString? get containerName;

  @BuiltValueField(wireName: r'accessKey')
  ConfigNodePropertyString? get accessKey;

  @BuiltValueField(wireName: r'rootPath')
  ConfigNodePropertyString? get rootPath;

  @BuiltValueField(wireName: r'connectionURL')
  ConfigNodePropertyString? get connectionURL;

  OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties._();

  factory OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties([void updates(OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties> get serializer => _$OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties, _$OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.accountName != null) {
      yield r'accountName';
      yield serializers.serialize(
        object.accountName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.containerName != null) {
      yield r'containerName';
      yield serializers.serialize(
        object.containerName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.accessKey != null) {
      yield r'accessKey';
      yield serializers.serialize(
        object.accessKey,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.rootPath != null) {
      yield r'rootPath';
      yield serializers.serialize(
        object.rootPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.connectionURL != null) {
      yield r'connectionURL';
      yield serializers.serialize(
        object.connectionURL,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accountName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.accountName.replace(valueDes);
          break;
        case r'containerName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.containerName.replace(valueDes);
          break;
        case r'accessKey':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.accessKey.replace(valueDes);
          break;
        case r'rootPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.rootPath.replace(valueDes);
          break;
        case r'connectionURL':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.connectionURL.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

