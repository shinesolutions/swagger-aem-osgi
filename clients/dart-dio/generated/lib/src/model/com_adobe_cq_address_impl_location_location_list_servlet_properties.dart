//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_address_impl_location_location_list_servlet_properties.g.dart';

/// ComAdobeCqAddressImplLocationLocationListServletProperties
///
/// Properties:
/// * [cqPeriodAddressPeriodLocationPeriodDefaultPeriodMaxResults] 
@BuiltValue()
abstract class ComAdobeCqAddressImplLocationLocationListServletProperties implements Built<ComAdobeCqAddressImplLocationLocationListServletProperties, ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.address.location.default.maxResults')
  ConfigNodePropertyInteger? get cqPeriodAddressPeriodLocationPeriodDefaultPeriodMaxResults;

  ComAdobeCqAddressImplLocationLocationListServletProperties._();

  factory ComAdobeCqAddressImplLocationLocationListServletProperties([void updates(ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder b)]) = _$ComAdobeCqAddressImplLocationLocationListServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqAddressImplLocationLocationListServletProperties> get serializer => _$ComAdobeCqAddressImplLocationLocationListServletPropertiesSerializer();
}

class _$ComAdobeCqAddressImplLocationLocationListServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqAddressImplLocationLocationListServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqAddressImplLocationLocationListServletProperties, _$ComAdobeCqAddressImplLocationLocationListServletProperties];

  @override
  final String wireName = r'ComAdobeCqAddressImplLocationLocationListServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqAddressImplLocationLocationListServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAddressPeriodLocationPeriodDefaultPeriodMaxResults != null) {
      yield r'cq.address.location.default.maxResults';
      yield serializers.serialize(
        object.cqPeriodAddressPeriodLocationPeriodDefaultPeriodMaxResults,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqAddressImplLocationLocationListServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.address.location.default.maxResults':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodAddressPeriodLocationPeriodDefaultPeriodMaxResults.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqAddressImplLocationLocationListServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqAddressImplLocationLocationListServletPropertiesBuilder();
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

