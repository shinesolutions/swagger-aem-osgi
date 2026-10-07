//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties.g.dart';

/// ComAdobeCqSocialCalendarServletsTimeZoneServletProperties
///
/// Properties:
/// * [timezonesPeriodExpirytime] 
@BuiltValue()
abstract class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties implements Built<ComAdobeCqSocialCalendarServletsTimeZoneServletProperties, ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'timezones.expirytime')
  ConfigNodePropertyInteger? get timezonesPeriodExpirytime;

  ComAdobeCqSocialCalendarServletsTimeZoneServletProperties._();

  factory ComAdobeCqSocialCalendarServletsTimeZoneServletProperties([void updates(ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder b)]) = _$ComAdobeCqSocialCalendarServletsTimeZoneServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCalendarServletsTimeZoneServletProperties> get serializer => _$ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesSerializer();
}

class _$ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCalendarServletsTimeZoneServletProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCalendarServletsTimeZoneServletProperties, _$ComAdobeCqSocialCalendarServletsTimeZoneServletProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCalendarServletsTimeZoneServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCalendarServletsTimeZoneServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.timezonesPeriodExpirytime != null) {
      yield r'timezones.expirytime';
      yield serializers.serialize(
        object.timezonesPeriodExpirytime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCalendarServletsTimeZoneServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'timezones.expirytime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.timezonesPeriodExpirytime.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCalendarServletsTimeZoneServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCalendarServletsTimeZoneServletPropertiesBuilder();
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

