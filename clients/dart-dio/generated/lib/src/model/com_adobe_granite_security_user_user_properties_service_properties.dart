//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_security_user_user_properties_service_properties.g.dart';

/// ComAdobeGraniteSecurityUserUserPropertiesServiceProperties
///
/// Properties:
/// * [adapterPeriodCondition] 
/// * [granitePeriodUserpropertiesPeriodNodetypes] 
/// * [granitePeriodUserpropertiesPeriodResourcetypes] 
@BuiltValue()
abstract class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties implements Built<ComAdobeGraniteSecurityUserUserPropertiesServiceProperties, ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'adapter.condition')
  ConfigNodePropertyString? get adapterPeriodCondition;

  @BuiltValueField(wireName: r'granite.userproperties.nodetypes')
  ConfigNodePropertyArray? get granitePeriodUserpropertiesPeriodNodetypes;

  @BuiltValueField(wireName: r'granite.userproperties.resourcetypes')
  ConfigNodePropertyArray? get granitePeriodUserpropertiesPeriodResourcetypes;

  ComAdobeGraniteSecurityUserUserPropertiesServiceProperties._();

  factory ComAdobeGraniteSecurityUserUserPropertiesServiceProperties([void updates(ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder b)]) = _$ComAdobeGraniteSecurityUserUserPropertiesServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteSecurityUserUserPropertiesServiceProperties> get serializer => _$ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesSerializer();
}

class _$ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteSecurityUserUserPropertiesServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteSecurityUserUserPropertiesServiceProperties, _$ComAdobeGraniteSecurityUserUserPropertiesServiceProperties];

  @override
  final String wireName = r'ComAdobeGraniteSecurityUserUserPropertiesServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteSecurityUserUserPropertiesServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adapterPeriodCondition != null) {
      yield r'adapter.condition';
      yield serializers.serialize(
        object.adapterPeriodCondition,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.granitePeriodUserpropertiesPeriodNodetypes != null) {
      yield r'granite.userproperties.nodetypes';
      yield serializers.serialize(
        object.granitePeriodUserpropertiesPeriodNodetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.granitePeriodUserpropertiesPeriodResourcetypes != null) {
      yield r'granite.userproperties.resourcetypes';
      yield serializers.serialize(
        object.granitePeriodUserpropertiesPeriodResourcetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteSecurityUserUserPropertiesServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'adapter.condition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.adapterPeriodCondition.replace(valueDes);
          break;
        case r'granite.userproperties.nodetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.granitePeriodUserpropertiesPeriodNodetypes.replace(valueDes);
          break;
        case r'granite.userproperties.resourcetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.granitePeriodUserpropertiesPeriodResourcetypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteSecurityUserUserPropertiesServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder();
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

