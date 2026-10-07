//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_foundation_impl_page_impressions_tracker_properties.g.dart';

/// ComDayCqWcmFoundationImplPageImpressionsTrackerProperties
///
/// Properties:
/// * [slingPeriodAuthPeriodRequirements] 
@BuiltValue()
abstract class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties implements Built<ComDayCqWcmFoundationImplPageImpressionsTrackerProperties, ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.auth.requirements')
  ConfigNodePropertyString? get slingPeriodAuthPeriodRequirements;

  ComDayCqWcmFoundationImplPageImpressionsTrackerProperties._();

  factory ComDayCqWcmFoundationImplPageImpressionsTrackerProperties([void updates(ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder b)]) = _$ComDayCqWcmFoundationImplPageImpressionsTrackerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmFoundationImplPageImpressionsTrackerProperties> get serializer => _$ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesSerializer();
}

class _$ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmFoundationImplPageImpressionsTrackerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmFoundationImplPageImpressionsTrackerProperties, _$ComDayCqWcmFoundationImplPageImpressionsTrackerProperties];

  @override
  final String wireName = r'ComDayCqWcmFoundationImplPageImpressionsTrackerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmFoundationImplPageImpressionsTrackerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodAuthPeriodRequirements != null) {
      yield r'sling.auth.requirements';
      yield serializers.serialize(
        object.slingPeriodAuthPeriodRequirements,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmFoundationImplPageImpressionsTrackerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.auth.requirements':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodAuthPeriodRequirements.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmFoundationImplPageImpressionsTrackerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmFoundationImplPageImpressionsTrackerPropertiesBuilder();
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

