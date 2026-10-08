//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties.g.dart';

/// ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties
///
/// Properties:
/// * [wcmdevmodefilterPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties implements Built<ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties, ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'wcmdevmodefilter.enabled')
  ConfigNodePropertyBoolean? get wcmdevmodefilterPeriodEnabled;

  ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties._();

  factory ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties([void updates(ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties> get serializer => _$ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties, _$ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.wcmdevmodefilterPeriodEnabled != null) {
      yield r'wcmdevmodefilter.enabled';
      yield serializers.serialize(
        object.wcmdevmodefilterPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'wcmdevmodefilter.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.wcmdevmodefilterPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder();
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

