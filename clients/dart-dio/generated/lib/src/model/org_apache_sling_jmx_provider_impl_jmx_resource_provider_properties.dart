//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jmx_provider_impl_jmx_resource_provider_properties.g.dart';

/// OrgApacheSlingJmxProviderImplJMXResourceProviderProperties
///
/// Properties:
/// * [providerPeriodRoots] 
@BuiltValue()
abstract class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties implements Built<OrgApacheSlingJmxProviderImplJMXResourceProviderProperties, OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'provider.roots')
  ConfigNodePropertyString? get providerPeriodRoots;

  OrgApacheSlingJmxProviderImplJMXResourceProviderProperties._();

  factory OrgApacheSlingJmxProviderImplJMXResourceProviderProperties([void updates(OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder b)]) = _$OrgApacheSlingJmxProviderImplJMXResourceProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJmxProviderImplJMXResourceProviderProperties> get serializer => _$OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesSerializer();
}

class _$OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJmxProviderImplJMXResourceProviderProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJmxProviderImplJMXResourceProviderProperties, _$OrgApacheSlingJmxProviderImplJMXResourceProviderProperties];

  @override
  final String wireName = r'OrgApacheSlingJmxProviderImplJMXResourceProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJmxProviderImplJMXResourceProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.providerPeriodRoots != null) {
      yield r'provider.roots';
      yield serializers.serialize(
        object.providerPeriodRoots,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJmxProviderImplJMXResourceProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'provider.roots':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.providerPeriodRoots.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJmxProviderImplJMXResourceProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder();
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

