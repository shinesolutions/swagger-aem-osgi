//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties.g.dart';

/// ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties
///
/// Properties:
/// * [allowedPeriodPaths] 
/// * [cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize] 
@BuiltValue()
abstract class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties implements Built<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties, ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder> {
  @BuiltValueField(wireName: r'allowed.paths')
  ConfigNodePropertyArray? get allowedPeriodPaths;

  @BuiltValueField(wireName: r'cq.analytics.saint.exporter.pagesize')
  ConfigNodePropertyInteger? get cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize;

  ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties._();

  factory ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties([void updates(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder b)]) = _$ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties> get serializer => _$ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesSerializer();
}

class _$ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties, _$ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.allowedPeriodPaths != null) {
      yield r'allowed.paths';
      yield serializers.serialize(
        object.allowedPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize != null) {
      yield r'cq.analytics.saint.exporter.pagesize';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'allowed.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.allowedPeriodPaths.replace(valueDes);
          break;
        case r'cq.analytics.saint.exporter.pagesize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodSaintPeriodExporterPeriodPagesize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesBuilder();
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

