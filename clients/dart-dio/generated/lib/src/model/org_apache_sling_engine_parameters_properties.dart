//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_engine_parameters_properties.g.dart';

/// OrgApacheSlingEngineParametersProperties
///
/// Properties:
/// * [slingPeriodDefaultPeriodParameterPeriodEncoding] 
/// * [slingPeriodDefaultPeriodMaxPeriodParameters] 
/// * [filePeriodLocation] 
/// * [filePeriodThreshold] 
/// * [filePeriodMax] 
/// * [requestPeriodMax] 
/// * [slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters] 
@BuiltValue()
abstract class OrgApacheSlingEngineParametersProperties implements Built<OrgApacheSlingEngineParametersProperties, OrgApacheSlingEngineParametersPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.default.parameter.encoding')
  ConfigNodePropertyString? get slingPeriodDefaultPeriodParameterPeriodEncoding;

  @BuiltValueField(wireName: r'sling.default.max.parameters')
  ConfigNodePropertyInteger? get slingPeriodDefaultPeriodMaxPeriodParameters;

  @BuiltValueField(wireName: r'file.location')
  ConfigNodePropertyString? get filePeriodLocation;

  @BuiltValueField(wireName: r'file.threshold')
  ConfigNodePropertyInteger? get filePeriodThreshold;

  @BuiltValueField(wireName: r'file.max')
  ConfigNodePropertyInteger? get filePeriodMax;

  @BuiltValueField(wireName: r'request.max')
  ConfigNodePropertyInteger? get requestPeriodMax;

  @BuiltValueField(wireName: r'sling.default.parameter.checkForAdditionalContainerParameters')
  ConfigNodePropertyBoolean? get slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters;

  OrgApacheSlingEngineParametersProperties._();

  factory OrgApacheSlingEngineParametersProperties([void updates(OrgApacheSlingEngineParametersPropertiesBuilder b)]) = _$OrgApacheSlingEngineParametersProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEngineParametersPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEngineParametersProperties> get serializer => _$OrgApacheSlingEngineParametersPropertiesSerializer();
}

class _$OrgApacheSlingEngineParametersPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEngineParametersProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEngineParametersProperties, _$OrgApacheSlingEngineParametersProperties];

  @override
  final String wireName = r'OrgApacheSlingEngineParametersProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEngineParametersProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodDefaultPeriodParameterPeriodEncoding != null) {
      yield r'sling.default.parameter.encoding';
      yield serializers.serialize(
        object.slingPeriodDefaultPeriodParameterPeriodEncoding,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slingPeriodDefaultPeriodMaxPeriodParameters != null) {
      yield r'sling.default.max.parameters';
      yield serializers.serialize(
        object.slingPeriodDefaultPeriodMaxPeriodParameters,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.filePeriodLocation != null) {
      yield r'file.location';
      yield serializers.serialize(
        object.filePeriodLocation,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.filePeriodThreshold != null) {
      yield r'file.threshold';
      yield serializers.serialize(
        object.filePeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.filePeriodMax != null) {
      yield r'file.max';
      yield serializers.serialize(
        object.filePeriodMax,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.requestPeriodMax != null) {
      yield r'request.max';
      yield serializers.serialize(
        object.requestPeriodMax,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters != null) {
      yield r'sling.default.parameter.checkForAdditionalContainerParameters';
      yield serializers.serialize(
        object.slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEngineParametersProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEngineParametersPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.default.parameter.encoding':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slingPeriodDefaultPeriodParameterPeriodEncoding.replace(valueDes);
          break;
        case r'sling.default.max.parameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.slingPeriodDefaultPeriodMaxPeriodParameters.replace(valueDes);
          break;
        case r'file.location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.filePeriodLocation.replace(valueDes);
          break;
        case r'file.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.filePeriodThreshold.replace(valueDes);
          break;
        case r'file.max':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.filePeriodMax.replace(valueDes);
          break;
        case r'request.max':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.requestPeriodMax.replace(valueDes);
          break;
        case r'sling.default.parameter.checkForAdditionalContainerParameters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEngineParametersProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEngineParametersPropertiesBuilder();
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

