//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_repository_service_user_configuration_properties.g.dart';

/// ComAdobeGraniteRepositoryServiceUserConfigurationProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [serviceusersPeriodSimpleSubjectPopulation] 
/// * [serviceusersPeriodList] 
@BuiltValue()
abstract class ComAdobeGraniteRepositoryServiceUserConfigurationProperties implements Built<ComAdobeGraniteRepositoryServiceUserConfigurationProperties, ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'serviceusers.simpleSubjectPopulation')
  ConfigNodePropertyBoolean? get serviceusersPeriodSimpleSubjectPopulation;

  @BuiltValueField(wireName: r'serviceusers.list')
  ConfigNodePropertyArray? get serviceusersPeriodList;

  ComAdobeGraniteRepositoryServiceUserConfigurationProperties._();

  factory ComAdobeGraniteRepositoryServiceUserConfigurationProperties([void updates(ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder b)]) = _$ComAdobeGraniteRepositoryServiceUserConfigurationProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRepositoryServiceUserConfigurationProperties> get serializer => _$ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesSerializer();
}

class _$ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRepositoryServiceUserConfigurationProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRepositoryServiceUserConfigurationProperties, _$ComAdobeGraniteRepositoryServiceUserConfigurationProperties];

  @override
  final String wireName = r'ComAdobeGraniteRepositoryServiceUserConfigurationProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRepositoryServiceUserConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.serviceusersPeriodSimpleSubjectPopulation != null) {
      yield r'serviceusers.simpleSubjectPopulation';
      yield serializers.serialize(
        object.serviceusersPeriodSimpleSubjectPopulation,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.serviceusersPeriodList != null) {
      yield r'serviceusers.list';
      yield serializers.serialize(
        object.serviceusersPeriodList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRepositoryServiceUserConfigurationProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'serviceusers.simpleSubjectPopulation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.serviceusersPeriodSimpleSubjectPopulation.replace(valueDes);
          break;
        case r'serviceusers.list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.serviceusersPeriodList.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteRepositoryServiceUserConfigurationProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRepositoryServiceUserConfigurationPropertiesBuilder();
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

