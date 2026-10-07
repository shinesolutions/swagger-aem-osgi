//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties.g.dart';

/// ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties
///
/// Properties:
/// * [resourcePeriodTypes] 
@BuiltValue()
abstract class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties implements Built<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties, ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder> {
  @BuiltValueField(wireName: r'resource.types')
  ConfigNodePropertyArray? get resourcePeriodTypes;

  ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties._();

  factory ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties([void updates(ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder b)]) = _$ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties> get serializer => _$ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesSerializer();
}

class _$ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties, _$ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties];

  @override
  final String wireName = r'ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.resourcePeriodTypes != null) {
      yield r'resource.types';
      yield serializers.serialize(
        object.resourcePeriodTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'resource.types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.resourcePeriodTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesBuilder();
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

