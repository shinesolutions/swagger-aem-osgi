//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_resources_impl_distribution_service_resour_properties.g.dart';

/// OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties
///
/// Properties:
/// * [providerPeriodRoots] 
/// * [kind] 
@BuiltValue()
abstract class OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties implements Built<OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties, OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder> {
  @BuiltValueField(wireName: r'provider.roots')
  ConfigNodePropertyString? get providerPeriodRoots;

  @BuiltValueField(wireName: r'kind')
  ConfigNodePropertyString? get kind;

  OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties._();

  factory OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties([void updates(OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder b)]) = _$OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties> get serializer => _$OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesSerializer();
}

class _$OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties, _$OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.providerPeriodRoots != null) {
      yield r'provider.roots';
      yield serializers.serialize(
        object.providerPeriodRoots,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.kind != null) {
      yield r'kind';
      yield serializers.serialize(
        object.kind,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder result,
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
        case r'kind':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.kind.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesBuilder();
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

