//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties.g.dart';

/// OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties
///
/// Properties:
/// * [maxPeriodRecursionPeriodLevels] 
@BuiltValue()
abstract class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties implements Built<OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties, OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'max.recursion.levels')
  ConfigNodePropertyInteger? get maxPeriodRecursionPeriodLevels;

  OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties._();

  factory OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties([void updates(OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder b)]) = _$OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties> get serializer => _$OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesSerializer();
}

class _$OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties, _$OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties];

  @override
  final String wireName = r'OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxPeriodRecursionPeriodLevels != null) {
      yield r'max.recursion.levels';
      yield serializers.serialize(
        object.maxPeriodRecursionPeriodLevels,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max.recursion.levels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPeriodRecursionPeriodLevels.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder();
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

