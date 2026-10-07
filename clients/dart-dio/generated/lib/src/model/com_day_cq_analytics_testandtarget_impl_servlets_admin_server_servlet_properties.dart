//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_properties.g.dart';

/// ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties
///
/// Properties:
/// * [testandtargetPeriodEndpointPeriodUrl] 
@BuiltValue()
abstract class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties implements Built<ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties, ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'testandtarget.endpoint.url')
  ConfigNodePropertyString? get testandtargetPeriodEndpointPeriodUrl;

  ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties._();

  factory ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties([void updates(ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder b)]) = _$ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties> get serializer => _$ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesSerializer();
}

class _$ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties, _$ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.testandtargetPeriodEndpointPeriodUrl != null) {
      yield r'testandtarget.endpoint.url';
      yield serializers.serialize(
        object.testandtargetPeriodEndpointPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'testandtarget.endpoint.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.testandtargetPeriodEndpointPeriodUrl.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder();
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

