//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_wcm_debug_filter_properties.g.dart';

/// ComDayCqWcmCoreImplWCMDebugFilterProperties
///
/// Properties:
/// * [wcmdbgfilterPeriodEnabled] 
/// * [wcmdbgfilterPeriodJspDebug] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplWCMDebugFilterProperties implements Built<ComDayCqWcmCoreImplWCMDebugFilterProperties, ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'wcmdbgfilter.enabled')
  ConfigNodePropertyBoolean? get wcmdbgfilterPeriodEnabled;

  @BuiltValueField(wireName: r'wcmdbgfilter.jspDebug')
  ConfigNodePropertyBoolean? get wcmdbgfilterPeriodJspDebug;

  ComDayCqWcmCoreImplWCMDebugFilterProperties._();

  factory ComDayCqWcmCoreImplWCMDebugFilterProperties([void updates(ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplWCMDebugFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplWCMDebugFilterProperties> get serializer => _$ComDayCqWcmCoreImplWCMDebugFilterPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplWCMDebugFilterPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplWCMDebugFilterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplWCMDebugFilterProperties, _$ComDayCqWcmCoreImplWCMDebugFilterProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplWCMDebugFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplWCMDebugFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.wcmdbgfilterPeriodEnabled != null) {
      yield r'wcmdbgfilter.enabled';
      yield serializers.serialize(
        object.wcmdbgfilterPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.wcmdbgfilterPeriodJspDebug != null) {
      yield r'wcmdbgfilter.jspDebug';
      yield serializers.serialize(
        object.wcmdbgfilterPeriodJspDebug,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplWCMDebugFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'wcmdbgfilter.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.wcmdbgfilterPeriodEnabled.replace(valueDes);
          break;
        case r'wcmdbgfilter.jspDebug':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.wcmdbgfilterPeriodJspDebug.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplWCMDebugFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder();
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

