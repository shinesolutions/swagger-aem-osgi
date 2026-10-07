//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_caconfig_impl_configuration_resolver_impl_properties.g.dart';

/// OrgApacheSlingCaconfigImplConfigurationResolverImplProperties
///
/// Properties:
/// * [configBucketNames] 
@BuiltValue()
abstract class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties implements Built<OrgApacheSlingCaconfigImplConfigurationResolverImplProperties, OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'configBucketNames')
  ConfigNodePropertyArray? get configBucketNames;

  OrgApacheSlingCaconfigImplConfigurationResolverImplProperties._();

  factory OrgApacheSlingCaconfigImplConfigurationResolverImplProperties([void updates(OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder b)]) = _$OrgApacheSlingCaconfigImplConfigurationResolverImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCaconfigImplConfigurationResolverImplProperties> get serializer => _$OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesSerializer();
}

class _$OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCaconfigImplConfigurationResolverImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCaconfigImplConfigurationResolverImplProperties, _$OrgApacheSlingCaconfigImplConfigurationResolverImplProperties];

  @override
  final String wireName = r'OrgApacheSlingCaconfigImplConfigurationResolverImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCaconfigImplConfigurationResolverImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.configBucketNames != null) {
      yield r'configBucketNames';
      yield serializers.serialize(
        object.configBucketNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCaconfigImplConfigurationResolverImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'configBucketNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.configBucketNames.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCaconfigImplConfigurationResolverImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder();
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

